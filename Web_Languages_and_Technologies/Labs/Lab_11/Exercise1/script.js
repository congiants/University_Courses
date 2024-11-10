document.addEventListener("DOMContentLoaded",

    function (event){

        function changeColor(){
            if(this.style.backgroundColor == 'green' ||this.style.backgroundColor == 'red'){
                return;
            }

            var randomNumber = parseInt(document.getElementById("randomNumber").innerHTML.split(" ").pop());
            var correctTries = parseInt(document.getElementById("correctTries").innerHTML.split(" ").pop());
            var wrongTries = parseInt(document.getElementById("wrongTries").innerHTML.split(" ").pop());
            if(parseInt(this.innerHTML)  % randomNumber == 0){
                this.style.backgroundColor = 'green';
                correctTries = correctTries + 1;
                document.getElementById("correctTries").innerHTML = "Correct tries: " + correctTries;
            }
            else{
                this.style.backgroundColor = 'red';
                wrongTries = wrongTries + 1;
                document.getElementById("wrongTries").innerHTML = "Wrong tries: " + wrongTries;
            }
        }

        function secondsTimer(seconds, display){
            var originalDisplay = display.innerHTML;
            var myInterval = setInterval(function () {
                display.innerHTML = originalDisplay + seconds;
                seconds = seconds-1;
                if(seconds === -1){
                    clearInterval(myInterval);
                    var correctTries = parseInt(document.getElementById("correctTries").innerHTML.split(" ").pop());
                    var wrongTries = parseInt(document.getElementById("wrongTries").innerHTML.split(" ").pop());
                    //(Σωστές προσπάθειες/Συνολικό πλήθος σωστών αριθμών)-(Λάθος Προσπάθειες/ (5*5 - Συνολικό πλήθος σωστών αριθμών))
                    var score = (correctTries/document.maxCorrect) - (wrongTries/(25 - document.maxCorrect));
                    document.getElementById("score").innerHTML = "Score: " + score; 

                }
            }, 1000);
        }

        function randomNumber(){

            document.maxCorrect = 0;
            document.maxWrong = 0;

            do{
                var randomNumber1 =  Math.random()*10
            }while(randomNumber1 < 3 || randomNumber1 > 9);
            var randomNumber = Math.round(randomNumber1);
            document.getElementById("randomNumber").innerHTML = "Random number: " + randomNumber;

            var table = document.getElementById("numberTable");
            for(var i =0; i < table.rows.length; i++){
                for(var j =0; j < table.rows[i].cells.length; j++){
                    table.rows[i].cells[j].innerHTML = Math.round(Math.random()*100);
                    table.rows[i].cells[j].addEventListener("click", changeColor);
                    if(table.rows[i].cells[j].innerHTML  % randomNumber == 0){
                        document.maxCorrect ++;
                    }
                    else{
                        document.maxWrong ++;
                    }
                }
            }

            var display = document.querySelector("h2");
            var seconds = 30;
            secondsTimer(seconds, display);      
        }
        document.getElementById("startButton").addEventListener("click", randomNumber);
    }
);
