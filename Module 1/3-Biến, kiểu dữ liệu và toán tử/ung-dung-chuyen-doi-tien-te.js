function click2(){
    let sotien = +document.getElementById("sotien").value;
    let giatridau = document.getElementById("giatridau").value;
    let giatrisau = document.getElementById("giatrisau").value;

    if(giatridau == "VND"){
        if(giatrisau == "VND"){
            // document.write("Result = " + sotien + " Đ")
            result.innerHTML = "Result = " + sotien + " Đ"
        }
        else{
            var vietmy = sotien/25000
            // document.write("Result = $" + vietmy)
            result.innerHTML = "Result = $" + vietmy
        }
    }
    else{
        if(giatrisau == "VND"){
            var myviet = (sotien*25000)
            // document.write("Result = " + myviet + " Đ")
            result.innerHTML = Result = "Result = " + myviet + " Đ"
        }
        else{
            // document.write("Result = $" + sotien)
            result.innerHTML = "Result = $" + sotien
        }
    }
}