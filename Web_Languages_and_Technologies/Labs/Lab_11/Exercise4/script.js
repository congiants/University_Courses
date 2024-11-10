document.addEventListener("DOMContentLoaded",
    function (event){
        function themeReveal(){
            var themeDiv = document.getElementById("dropdownThemesDiv");
            themeDiv.style.display =="none" ? themeDiv.style.display = "block ": themeDiv.style.display = "none";
        }

        function themeDisappear(){
            var themeDiv = document.getElementById("dropdownThemesDiv");
            themeDiv.style.display =="none" ? themeDiv.style.display = "block ": themeDiv.style.display = "none";
        }

        function addTheme(){
            var select = document.getElementById("dropdownThemesSelect");
            var option = select.options[select.selectedIndex].text;
            var themeTextarea = document.getElementById("themeTextarea");
            themeTextarea.innerHTML = themeTextarea.innerHTML + option + " ";
        }

        function showSubmition(){
            var title = document.getElementById("titleTextarea").value;
            var writer = document.getElementById("writterTextarea").value;
            var themes = document.getElementById("themeTextarea").value;

            var submitTitle =document.getElementById("submitTitle");
            var submitWritter =document.getElementById("submitWritter");
            var submitThemes =document.getElementById("submitThemes");

            submitTitle.innerHTML = title;
            submitWritter.innerHTML = writer;
            submitThemes.innerHTML = themes;

            var submitResultsDiv = document.getElementById("submitResultsDiv");
            submitResultsDiv.style.display = "block";

        }

        document.getElementById("themeButton").addEventListener("click", themeReveal);
        document.getElementById("themeDisappearButton").addEventListener("click", themeDisappear);
        document.getElementById("addThemeButton").addEventListener("click", addTheme);
        document.getElementById("submitButton").addEventListener("click", showSubmition);
    }
);