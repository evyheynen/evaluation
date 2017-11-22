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

    @Ignore
    @Test
    public void testAddEvaluation() {

        String jsonEvaluation = "{\"title\": \"Ow yeah\",\"publisher\": \"tom\",\"author\": \"Aaron\",\"pages\": 158,\"ebook\": false," +
                "\"subject\": \"ME\",\"language\": \"DUTCH\",\"genre\": \"ROMAN\",\"isbn\": \"123\"}";

        HttpEntity<String> data = new HttpEntity<>(jsonEvaluation, headers);

        ResponseEntity<Integer> response = template.postForEntity(URL, data, Integer.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(1);

    }

}
