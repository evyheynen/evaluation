package be.oak3.evaluation.Controller;

import be.oak3.evaluation.model.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@WebAppConfiguration
public class EvaluationControllerTest {

    private static final String URL = "http://localhost:8080/evaluation";
    private RestTemplate template;
    private HttpHeaders headers;

    @Before
    public void init() {
        template = new RestTemplate();

        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
    }

    @Test
    public void testAddEvaluation() {
        String jsonEvaluation = "{\"date\": 1484175600000,\"course_id\": 1,\"instructor_id\": 1,\"student_id\": 1}";

        HttpEntity<String> data = new HttpEntity<>(jsonEvaluation, headers);

        ResponseEntity<Integer> response = template.postForEntity(URL, data, Integer.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(1);
    }

    @Test
    public void testAddStudent() {
        String jsonStudent = "{ \"name\": \"tom\",\"company\": \"tcla\",\"email\": \"tom@tcla.be\"}";

        HttpEntity<String> student = new HttpEntity<>(jsonStudent, headers);

        ResponseEntity<Integer> response=template.postForEntity(URL + "/students", student, Integer.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(1);
    }
    @Test
    public void testAddAnswer() {
        String jsonAnswer = "{\"answer\":\"test\",\"question_id\":1,\"evaluation_id\":1}";

        HttpEntity<String> data = new HttpEntity<>(jsonAnswer, headers);

        ResponseEntity<Integer> response = template.postForEntity(URL + "/answers", data, Integer.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(1);
    }

    @Test
    public void testFindAll(){
    ResponseEntity<List> responseEntity=template.getForEntity(URL,List.class);
    assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(responseEntity.getBody()).isNotEmpty();

    ResponseEntity<String> jsonArray= template.getForEntity(URL, String.class);
        try {
        List<Evaluation> allEvaluations= new ArrayList<>();
        JSONArray array= new JSONArray(jsonArray.getBody());
        for (int i=0;i<array.length();i++){
            JSONObject jsonEvaluation = array.getJSONObject(i);
            Evaluation javaEvaluation=new Evaluation();
            javaEvaluation.setId(jsonEvaluation.getInt("id"));
            javaEvaluation.setCourse_id(jsonEvaluation.getInt("course_id"));
            javaEvaluation.setInstructor_id(jsonEvaluation.getInt("instructor_id"));
            javaEvaluation.setStudent_id(jsonEvaluation.getInt("student_id"));
//          javaEvaluation.setDate(jsonEvaluation.getDate("date"));
//          javaEvaluation.setDate(Date.valueOf(jsonObject.getString("date")));

            allEvaluations.add(javaEvaluation);

        }
        Evaluation myEvaluation=allEvaluations.get(0);
        assertThat(myEvaluation.getId()).isEqualTo(1);
        assertThat(myEvaluation.getCourse_id()).isEqualTo(1);
        assertThat(myEvaluation.getInstructor_id()).isEqualTo(1);
        assertThat(myEvaluation.getStudent_id()).isEqualTo(1);
        //assertThat(myEvaluation.getDate()).isEqualTo();

    } catch (JSONException e) {
        e.printStackTrace();
    }
}
    @Test
    public void testFindAllInstructors(){
        ResponseEntity<List> responseEntity=template.getForEntity(URL,List.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isNotEmpty();

        ResponseEntity<String> jsonArray= template.getForEntity(URL, String.class);
        try {
            List<Instructor> allInstructors= new ArrayList<>();
            JSONArray array= new JSONArray(jsonArray.getBody());
            for (int i=0;i<array.length();i++){
                JSONObject jsonInstructor = array.getJSONObject(i);
                Instructor javaInstructor=new Instructor();
                javaInstructor.setId(jsonInstructor.getInt("id"));
                javaInstructor.setName(jsonInstructor.getString("name"));
                javaInstructor.setCompany(jsonInstructor.getString("company"));

                allInstructors.add(javaInstructor);

            }
            Instructor myInstructor=allInstructors.get(0);
            assertThat(myInstructor.getId()).isEqualTo(1);
            assertThat(myInstructor.getName()).isEqualTo("Kenneth");
            assertThat(myInstructor.getCompany()).isEqualTo("Oak3");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindAllCourses(){
        ResponseEntity<List> responseEntity=template.getForEntity(URL,List.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isNotEmpty();

        ResponseEntity<String> jsonArray= template.getForEntity(URL, String.class);
        try {
            List<Courses> allCourses= new ArrayList<>();
            JSONArray array= new JSONArray(jsonArray.getBody());
            for (int i=0;i<array.length();i++){
                JSONObject jsonCourse = array.getJSONObject(i);
                Courses javaCourses=new Courses();
                javaCourses.setId(jsonCourse.getInt("id"));
                javaCourses.setName(jsonCourse.getString("name"));

                allCourses.add(javaCourses);

            }
            Courses myCourses=allCourses.get(0);
            assertThat(myCourses.getId()).isEqualTo(1);
            assertThat(myCourses.getName()).isEqualTo("java");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindAllQuestions(){
        ResponseEntity<List> responseEntity=template.getForEntity(URL,List.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isNotEmpty();

        ResponseEntity<String> jsonArray= template.getForEntity(URL, String.class);
        try {
            List<Question> allQuestions= new ArrayList<>();
            JSONArray array= new JSONArray(jsonArray.getBody());
            for (int i=0;i<array.length();i++){
                JSONObject jsonQuestion = array.getJSONObject(i);
                Question javaQuestion=new Question();
                javaQuestion.setId(jsonQuestion.getInt("id"));
                javaQuestion.setQuestion(jsonQuestion.getString("question"));

                allQuestions.add(javaQuestion);

            }
            Question myQuestion=allQuestions.get(0);
            assertThat(myQuestion.getId()).isEqualTo(1);
            assertThat(myQuestion.getQuestion()).isEqualTo("Knowledge and skills gained");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindAllStudents(){
        ResponseEntity<List> responseEntity=template.getForEntity(URL,List.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isNotEmpty();

        ResponseEntity<String> jsonArray= template.getForEntity(URL, String.class);
        try {
            List<Student> allStudents= new ArrayList<>();
            JSONArray array= new JSONArray(jsonArray.getBody());
            for (int i=0;i<array.length();i++){
                JSONObject jsonStudent = array.getJSONObject(i);
                Student javaStudent=new Student();
                javaStudent.setId(jsonStudent.getInt("id"));
                javaStudent.setName(jsonStudent.getString("name"));
                javaStudent.setCompany(jsonStudent.getString("company"));
                javaStudent.setEmail(jsonStudent.getString("email"));

                allStudents.add(javaStudent);

            }
            Student myStudent=allStudents.get(0);
            assertThat(myStudent.getId()).isEqualTo(1);
            assertThat(myStudent.getName()).isEqualTo("evy");
            assertThat(myStudent.getCompany()).isEqualTo("QNH");
            assertThat(myStudent.getEmail()).isEqualTo("evy.heynen@telenet.be");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
