const imgDiv = document.querySelector(".img-div");
const btn = document.querySelector("#btn");
const reset = document.querySelector("#reset");
const body = document.querySelector("body");

let array = [];
array[0] = "https://picsum.photos/id/10/200";
array[1] = "https://picsum.photos/id/100/200";
array[2] = "https://picsum.photos/id/1001/200";
array[3] = "https://picsum.photos/id/1003/200";
array[4] = "https://picsum.photos/id/1018/200";

let imgArray = [];
for (let i = 0; i < 5; i++) {
    let image = document.createElement("img");
    image.src = array[i];
    image.setAttribute("data-ns-test", "img" + (i + 1));
    imgArray[i] = image;
}

let image = document.createElement("img");
let ran = Math.floor(Math.random() * 5);
image.src = array[ran];
image.setAttribute("data-ns-test", "img" + (ran + 1));
imgArray[5] = image;

shuffleArray(imgArray);

for (let i = 0; i < 6; i++) {
    imgDiv.appendChild(imgArray[i]);
}

let item1 = "", item2 = "";

imgDiv.addEventListener("click", function (ev) {
    const item = ev.target;

    if (item.tagName === "IMG") {
        if (item1 === "") {
            item.style.opacity = 0.6;
            item1 = item;
        }
        else if (item2 === "" && item !== item1) {
            item.style.opacity = 0.6;
            item2 = item;
        }
        else if (item !== item1 && item !== item2) {
            item.style.opacity = 0.6
            item2.style.opacity = 1;
            item2 = item;
        }
    }

    if (item1 !== "" || item2 !== "") {
        reset.style.display = "inline";
    }
    else {
        reset.style.display = "none";
    }

    if (item1 !== "" && item2 !== "") {
        btn.style.display = "inline";
    }
    else {
        btn.style.display = "none";
    }

})

reset.addEventListener("click", function (ev) {
    item1.style.opacity = 1;
    item2.style.opacity = 1;
    item1 = "";
    item2 = "";
    reset.style.display = "none";
    btn.style.display = "none";
    const para = document.querySelector("#para");
    para.remove();
})

btn.addEventListener("click", function () {
    if (item1.src === item2.src) {
        const para = document.createElement("p");
        para.id = "para";
        para.innerHTML = "You are a human. Congratulations!";
        body.appendChild(para);
    }
    else {
        const para = document.createElement("p");
        para.id = "para";
        para.innerHTML = "We can't verify you as a human. You selected the non-identical tiles.";
        body.appendChild(para);
    }
    btn.style.display = "none";
})

function shuffleArray(array) {
    for (let i = array.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
}
