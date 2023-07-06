let sodau = document.getElementById("sodau")
let sosau = document.getElementById("sosau")
console.log(sodau);

function cong(){
    console.log(sodau.value);
    let tong = +sodau.value + +sosau.value
    result.innerHTML = tong
}
function hieu(){
    let sodau = +document.getElementById("sodau").value
    let sosau = +document.getElementById("sosau").value
    let hieu = sodau - sosau
    result.innerHTML = hieu
}
function nhan(){
    let sodau = +document.getElementById("sodau").value
    let sosau = +document.getElementById("sosau").value
    let nhan = sodau * sosau
    result.innerHTML = nhan
}
function chia(){
    let sodau = +document.getElementById("sodau").value
    let sosau = +document.getElementById("sosau").value
    let chia = sodau / sosau
    result.innerHTML = chia
}
