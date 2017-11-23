
$( document ).ready(function() {
    console.log( "ready!" );


let URL = "http://localhost:8080/evaluation";

function getCourseInfo(url){
    let courses = url + "/courses";

    console.log(url);

    $.get(courses, function (response, status) {
        console.log(status);
        if(status === "success"){
            let course_info = `
                    <div class="col-md-6">
                        <label for="course">Course:</label>
                            <select name="course" id="course">`;

            response.forEach(function (el) {
                console.log("courses loading " + el);
                course_info += `
                                <option value="${el.id}">${el.name}</option>
                            `;
            });

            course_info += `
                            </select><br>
                    </div>
                `;

            $("#course_info").html(course_info);


        }

    },"json");

    let instructors = url + "/instructors";

    $.get(instructors, function (response, status) {
        console.log(status);
        if(status === "success"){
            let course_info = `
                    <div class="col-md-6">
                        <label for="instructor">Instructors:</label>
                            <select name="instructor" id="instructor">`;

            response.forEach(function (el) {
                course_info += `
                                <option value="${el.id}">${el.name}</option>
                            `;
            });

            course_info += `
                            </select><br>
                    </div>
                `;

            $("#course_info").append(course_info);


        }

    },"json");

}

function getQuestions(url){

    let instructors = url + "/questions";

    $.get(instructors, function (response, status) {
        console.log(status);
        if(status === "success"){
            let q = `
                    <div class="col-md-6">
                        <label for="questions">Questions:</label>
                            `;

            response.forEach(function (el) {
                q += `
                <p>${el.question}</p>
                <input type="text" name="" id="${el.id}" class="form-control" placeholder="" aria-describedby="helpId"><br>
                                
                            `;
            });

            q += `
                            <br>
                    </div>
                `;

            $("#questions").html(q);


        }

    },"json");
}

function postAjax(object,url){
    $.ajax({
        type: "POST",
        url: url,
        // The key needs to match your method's input parameter (case-sensitive).
        data: JSON.stringify(object),
        contentType: "application/json; charset=utf-8",
        dataType: "text",
        success: function(){alert(url);}
    });
}

getQuestions(URL);
getCourseInfo(URL);

$("#send").click(function(){

    //Evaluation object
    let date = new Date();
    let course = $('#course').val();
    let instructor = $("#instructor").val();
    let student = 1;

    let evaluation = {
        date:date,
        course_id: course,
        instructor_id: instructor,
        student_id: student

    };

    // Evaluation
    postAjax(evaluation, URL );

    //Answer object
    let question_id = 1;
    let evaluation_id;



});

});