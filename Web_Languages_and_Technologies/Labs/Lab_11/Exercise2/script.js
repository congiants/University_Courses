document.addEventListener("DOMContentLoaded", 

    function (event){
        var imagesArray = [];
        var i =0;
        var myInterval;

        function addRow(){
            var table = document.getElementById("imgTable");
            var row = table.insertRow(-1);

            var urlCell = row.insertCell(0);
            var urlInput = document.createElement("input");
            urlInput.type = "url";
            urlInput.placeholder = "Enter URL..";
            urlCell.appendChild(urlInput);

            var loadButtonCell = row.insertCell(1);
            var loadButton = document.createElement("button");
            loadButton.innerText = "Load image"
            loadButton.style.width = "170px";   
            loadButton.style.height = "50px"; 
            loadButton.style.fontSize = "large";
            loadButton.onclick = function() {
                loadImage(row);
            }
            loadButtonCell.appendChild(loadButton);

            var imageCell = row.insertCell(2);
        }

        function loadImage(row){
            var urlCell = row.cells[0];
            var imgCell = row.cells[2];
            var url = urlCell.querySelector("input").value;

            var img = document.createElement("img");
            img.src = url;
            img.style.maxWidth = "200px";
            img.classList.add("urlImg")

            while(imgCell.firstChild){
                imgCell.removeChild(imgCell.firstChild)
            }
            imgCell.appendChild(img);
            imagesArray.push(img);

        }
        

        function startSlideshow(){
            alert(imagesArray.length)
            myInterval = setInterval(function () {;
                var display = document.getElementById("slideShowImg");
                display.src = imagesArray[i].src;
                if(i === imagesArray.length){
                    i = 1;
                }
                else{
                    i++
                }
            }, 3000);
        }

        function stopSlideshow(myInterval){
            clearInterval(myInterval);
            var display = document.getElementById("slideShowImg");
            display.src = null;
        }

        addRow();

        var startSlideshowButton = document.getElementById("startSlideshowButton");
        var stopSlideshowButton = document.getElementById("stopSlideshowButton");
        var addButton = document.getElementById("addRowButton");
        addButton.addEventListener("click", addRow);
        startSlideshowButton.addEventListener("click", startSlideshow);
        stopSlideshowButton.addEventListener("click", stopSlideshow);
    }
);
