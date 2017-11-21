package be.oak3.evaluation.controllerTest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebAppConfiguration
public class EvaluationWebTest {

    private static final String URL="http://localhost:8080/evaluation";
    private RestTemplate template;

    @Before
    public void init(){
        template=new RestTemplate();
    }

    @Test
    public void testAddEvaluation(){
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String jsonEvaluation="";

        HttpEntity<String> data= new HttpEntity<>(jsonEvaluation,headers);

        ResponseEntity<Integer> responseEntity=template.postForEntity(URL, data, Integer.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(1);
    }

}

