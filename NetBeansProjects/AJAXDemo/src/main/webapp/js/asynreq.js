/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

document.getElementById("pwd").addEventListener("focus", function () {

    var email = document.getElementById("eml").value;

    if (email === "") {
        return;
    }

    var req = new XMLHttpRequest();

    req.open("POST", "CheckUser", true);

    req.setRequestHeader(
        "Content-Type",
        "application/x-www-form-urlencoded"
    );

    req.onreadystatechange = function () {

        if (req.readyState === 4 && req.status === 200) {

            var data = JSON.parse(req.responseText);

            if (data.exist === "true") {
                document.getElementById("userAlert").style.display = "block";
            }
        }
    };

    req.send("email=" + encodeURIComponent(email));
});