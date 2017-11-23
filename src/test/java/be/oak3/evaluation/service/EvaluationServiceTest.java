package be.oak3.evaluation.service;

import be.oak3.evaluation.EvaluationApplication;
import be.oak3.evaluation.model.*;
import be.oak3.evaluation.repository.EvaluationRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EvaluationApplication.class)
public class EvaluationServiceTest {

    @Autowired
    private EvaluationService service;

    private Evaluation evaluation;
    private Student student;
    private Answer answer;

    @Test
    public void testFindAll(){
    List<Evaluation> evaluations=service.findAll();
    assertThat(evaluations).isNotEmpty();
    }

    @Test
    public void testFindAllInstructors(){
        List<Instructor> instructors=service.findAllInstructors();
        assertThat(instructors).isNotEmpty();
    }

    @Test
    public void testFindAllCourses(){
        List<Courses> courses=service.findAllCourses();
        assertThat(courses).isNotEmpty();
    }

    @Test
    public void testFindAllQuestions(){
        List<Question> questions=service.findAllQuestions();
        assertThat(questions).isNotEmpty();
    }

    @Test
    public void testAddEvaluation(){
    evaluation = new Evaluation(null,1,1,1);
        int i = service.addEvaluation(evaluation);
        assertThat(i).isEqualTo(1);
    }

    @Test
    public void testAddStudent(){
        student=new Student("Evy Heynen","QNH","evy.heynen@telenet.be");
        int i=service.addStudent(student);
        assertThat(i).isEqualTo(1);
    }

    @Test
    public void testAddAnswer(){
        answer=new Answer("5",1,1);
        int i=service.addAnswer(answer);
        assertThat(i).isEqualTo(1);
    }

}
