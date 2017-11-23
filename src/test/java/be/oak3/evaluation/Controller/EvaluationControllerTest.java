package be.oak3.evaluation.Controller;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

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

}
