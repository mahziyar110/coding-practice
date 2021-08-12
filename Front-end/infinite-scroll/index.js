let main = document.querySelector("body");

var load = function () {
    for (var i = 0; i < 10; i++) {
        let item = document.createElement("div");
        item.innerText = "Loading...";
        main.appendChild(item);
        let pic = document.createElement("img");
        pic.src = "https://picsum.photos/300";
        main.appendChild(pic);
    }
}


window.addEventListener('scroll', function () {
    var sum = this.window.scrollY + this.window.innerHeight;
    console.log(this.window.scrollY + " " + this.window.innerHeight + " " + main.scrollHeight + " " + sum);

    if (this.window.scrollY + this.window.innerHeight >= main.scrollHeight) {
        console.log("here");
        load();
    }
});
load();
