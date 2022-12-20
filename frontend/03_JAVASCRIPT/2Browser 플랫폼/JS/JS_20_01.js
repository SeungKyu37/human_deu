// window.onload = function (){
    window.addEventListener("load", function(){
        let btn = window.document.getElementById("btnInput");
         btn.onclick = function (){
            let x,y;
            x=eval(prompt("x값 입력"),0);
            y=eval(prompt("y값 입력"),0);
        
            btnInput.value = x+y;
            btnInput.type = "text";
    };
});

