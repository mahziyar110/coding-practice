const cardNames = [
    '2C', '2D', '2H', '2S',
    '3C', '3D', '3H', '3S',
    '4C', '4D', '4H', '4S',
    '5C', '5D', '5H', '5S',
    '6C', '6D', '6H', '6S',
    '7C', '7D', '7H', '7S',
    '8C', '8D', '8H', '8S',
    '9C', '9D', '9H', '9S',
    '10C', '10D', '10H', '10S',
    'AC', 'AD', 'AH', 'AS',
    'JC', 'JD', 'JH', 'JS',
    'KC', 'KD', 'KH', 'KS',
    'QC', 'QD', 'QH', 'QS'];

let nodeArr = [];

render();

function render() {
    // let localArr = localStorage.getItem("newNode");
    // if (localArr) {
    //     localArr = localArr.split(",");
    //     renderFromLocal(localArr);
    //     return;
    // }
    shuffleArray(cardNames);

    let imgArr = [];
    let count = 0;
    let deck = document.querySelector("#deck");
    deck.innerHTML = "";

    cardNames.forEach(el => {
        let pic = document.createElement("div");
        pic.style.backgroundImage = `url("https://raw.githubusercontent.com/Newton-School/Deck_of_Cards/main/JPEG/${el}.jpg")`;
        pic.style.backgroundSize = "contain";
        pic.id = count++;
        pic.style.width = "50px";
        pic.style.height = "75px";
        pic.draggable = "true";
        pic.addEventListener("dragstart", function (event) {
            drag(event);
        });

        imgArr.push(pic);
    })

    shuffleArray(imgArr);

    imgArr.forEach(el => {
        const div = document.createElement("div");
        div.appendChild(el);
        deck.appendChild(div);
    })

    // store();
}

// function renderFromLocal(localArr) {
//     localArr.forEach(el => {
//         let pic = document.createElement("img");
//         pic.src = "https://raw.githubusercontent.com/Newton-School/Deck_of_Cards/main/JPEG/" + cardNames[el] + ".jpg";
//         pic.id = el;
//         pic.style.width = "50px";
//         pic.style.height = "75px";
//         pic.draggable = "true";
//         pic.addEventListener("dragstart", function (event) {
//             drag(event);
//         });

//         let deck = document.querySelector("#deck");
//         deck.appendChild(pic);
//     })
// }

// function store() {
//     let deck = document.querySelector("#deck");
//     let node = deck.childNodes;
//     nodeArr.length = 0;
//     node.forEach(el => {
//         nodeArr.push(el.id);
//     })
//     localStorage.newNode = nodeArr;
// }

function check() {
    let deck = document.querySelector("#deck");
    let divNode = deck.children;

    function isDeckEmpty() {
        for (const el of divNode) {
            if (el.childElementCount) {
                return false;
            }
        }
        return true;
    }

    if (isDeckEmpty()) {
        let para = document.querySelector("#msg");
        let btn = document.querySelector("#restart-button");
        para.style.display = "block";
        btn.style.display = "block";
    }
}

function restart() {
    render();
    let para = document.querySelector("#msg");
    let btn = document.querySelector("#restart-button");
    para.style.display = "none";
    btn.style.display = "none";
}

function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev) {
    ev.preventDefault();
    var id = ev.dataTransfer.getData("text");
    var card = document.getElementById(id);

    let cardHolder = ev.target.id;

    if (id % 4 == 0) {
        if (cardHolder === "100") {
            card.remove();
        }
    }
    else if (id % 4 == 1) {
        if (cardHolder === "101") {
            card.remove();
        }

    }
    else if (id % 4 == 2) {
        if (cardHolder === "102") {
            card.remove();
        }

    }
    else if (id % 4 == 3) {
        if (cardHolder === "103") {
            card.remove();
        }

    }
    // store();
    check();
}




function shuffleArray(array) {
    for (let i = array.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
}

