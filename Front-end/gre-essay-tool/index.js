function count() {
    let h3 = document.querySelector("h3");
    let textArea = document.querySelector("textarea");
    let str = textArea.value;
    let count = 0;
    let arr = str.split(" ");
    for(let word of arr) {
        if(word !== "") {
            count++;
        }
    }

    h3.innerText = count;

}