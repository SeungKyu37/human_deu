window.addEventListener("load", function(){
    let section = document.querySelector("#section1");
    let fileButton = section.querySelector("#file-button");
    let fileTriggerButton = section.querySelector("#file-trigger-button");

    fileButton.onclick = function(e){

    };
    // fileTriggerButton은 span tag로 파일을 선택하는 기능이 없음
    fileTriggerButton.onclick = function(e){
        // 마우스 이벤트 객체 받아옴
        // 크롬에서만 진행됨.
        let event = new MouseEvent("click",{
            'view':window,
            'bubbles':true,     // 버블링이 가능한지?
            'cancelable':true   // cancel이 가능한지?
        })
        // fileTriggerButton을 통해서 fileButton을 trigger함.
        fileButton.dispatchEvent(event);
    };
});