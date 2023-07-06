function nut1(){
    let nam = document.getElementById("nam").value;
    if(nam % 4 == 0){
        if(nam % 100 == 0){
            if(nam % 400 ==0){
                ketqua.innerHTML   = "Năm " + nam + " là năm nhuận"
            }
            else{
                ketqua.innerHTML  = "Năm " + nam + " là năm không nhuận"
            }
        }
        else{
            ketqua.innerHTML  = "Năm " + nam + " là năm nhuận"
        }
    }
    else{
        ketqua.innerHTML  = "Năm " + nam + " là năm không nhuận"
    }
 
}

