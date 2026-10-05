/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
let field = document.querySelector('#eml');
let asyncreq = function () {
    const req = new XMLHttpRequest();
    req.open(
        "GET",
        "http://localhost:8080/AJAXDemo/CheckUser?email=" + field.value,
        true
    );
    req.onreadystatechange = function () {
        if (req.readyState === 4) {

            if (req.status === 200) {
                let obj=JSON.parse(req.responseText);
                textdata=obj.exist;
                if(textdata==="false"){
                        document.getElementById("espan").innerHTML="";
                }else{
                        document.getElementById("espan").innerHTML="Email already registered";
                } 
            }
        }
    };
    req.send(null);
};
field.addEventListener('blur', asyncreq);

