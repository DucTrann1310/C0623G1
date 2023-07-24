document.getElementById("kiemtra").addEventListener('click',function(){
    let arr = new Array
    tudoixung = document.getElementById("tudoixung").value
    arr = tudoixung.split("")
    // console.log(arr);
    flag = true
    for(i=0;i<arr.length;i++){
        if(arr[i] != arr[arr.length-1-i]){
            flag = false
            document.getElementById("result").innerHTML =  'Hàm không đối xứng';
            break

        }
    }
    if(flag == true){
        document.getElementById("result").innerHTML =  'Hàm đối xứng';
    }
})