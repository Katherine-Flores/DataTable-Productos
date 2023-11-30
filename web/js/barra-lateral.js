const logo = document.getElementById("logo");
const barraLateral = document.querySelector(".barra-lateral");
const spans = document.querySelectorAll("span");
const interruptor = document.querySelector(".switch");
const circulo = document.querySelector(".circulo");
const user = document.querySelector(".bxs-user-circle");
const menu = document.querySelector(".menu");
const main = document.querySelector("main");

logo.addEventListener("click", ()=>{
    barraLateral.classList.toggle("mini-barra-lateral");
    if(barraLateral.classList.contains("mini-barra-lateral")){
        main.classList.toggle("min-main");
    }else{
        main.classList.toggle("min-main");
    }
    spans.forEach((span)=>{
        span.classList.toggle("oculto");
    });
});

interruptor.addEventListener("click",()=>{
    var body = document.body;
    body.classList.toggle("dark-mode");
    circulo.classList.toggle("prendido");
    if(logo.src.endsWith('img/Logo-black.svg')){
        logo.src = 'img/Logo-white.svg';
        user.style.color = 'white';
    }else{
        logo.src = 'img/Logo-black.svg';
        user.style.color = 'black';
    } 
});

menu.addEventListener("click", ()=>{
    barraLateral.classList.toggle("max-barra-lateral");
    if(barraLateral.classList.contains("max-barra-lateral")){
        menu.children[0].style.display = "none";
        menu.children[1].style.display = "block";
    }else{
        menu.children[0].style.display = "block";
        menu.children[1].style.display = "none";
    }

    if(window.innerWidth<=370){
        barraLateral.classList.add("mini-barra-lateral");
        main.classList.add("min.main");
        spans.forEach((span)=>{
            span.classList.add("oculto");
        });
    }
});