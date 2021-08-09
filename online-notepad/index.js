const text = document.querySelector("#textarea");
const localData = localStorage.getItem("autosave-data");

text.value = localData;

const checkBox = document.querySelector("#feature-flag");

checkBox.addEventListener("change", function () {
    if (checkBox.checked) {
        document.interval = setInterval(() => {
            localStorage.setItem("autosave-data", text.value);
        }, 1000);
    }
    else {
        clearInterval(document.interval)
    }
})
