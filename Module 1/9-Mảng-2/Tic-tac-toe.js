function taocaro(ovuong){
    caro = new Array(ovuong)
    for(i=0;i<caro.length;i++){
       caro[i] = new Array(ovuong)
       for(j=0;j<caro[i].length;j++){
            caro[i][j] = "0"
       }                      
    }
    console.log(caro);
    return caro
}
function vecaro(bangcaro){
    caroTable = ""
    for(i=0;i<bangcaro.length;i++){
        caroTable += `<tr>`
        for(j=0;j<bangcaro[i].length;j++){
            caroTable += 
            `<td onclick='changecaro(${i},${j})'>${bangcaro[i][j] == 0 ? `&nbsp&nbsp`:bangcaro[i][j]}</td>`
        }
        caroTable += `</tr>`
    }
    document.getElementById("tBody").innerHTML = caroTable
}

caro = taocaro(5)
vecaro(caro)
let player_1 = true

function changecaro(i,j){
    if(player_1 == true){
        caro[i][j] = 'X';
    }
    else{
        caro[i][j] =  'O';
    }
    vecaro(caro)
    player_1 = !player_1
}
let numberOfWin = 3
function checkWin(caro, player){
    let symbol = player == true ? "X" : "O"
    for(i=0;i<caro.length;i++){
        for(j=0;j<caro[i].length - numberOfWin + 1;j++){
        }
    }
}