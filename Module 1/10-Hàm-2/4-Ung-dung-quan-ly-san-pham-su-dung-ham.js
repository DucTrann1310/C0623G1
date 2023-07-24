let listProduct = new Array
document.getElementById("addproduct").addEventListener("click",function(){
    nameOfProduct = document.getElementById("nameOfProduct").value
    listProduct.push(nameOfProduct)
    show(listProduct)
    document.getElementById("nameOfProduct").value  = ""
    
})
function show(listProduct){
    tBody = ""
    for(i=0;i<listProduct.length;i++){
        tBody += 
            `<tr>
                <td>${listProduct[i]}</td>
                <td><button onclick='delProduct("${listProduct[i]}")'>Delete</button></td>
                <td><button onclick='editProduct("${listProduct[i]}")'>Edit</button></td>
            </tr>`
    }
    document.getElementById("tBody").innerHTML = tBody
}
function delProduct(nameOfProduct){
    listProductNew = new Array
    for(i=0;i<listProduct.length;i++){
        if(listProduct[i] != nameOfProduct){
            listProductNew.push(listProduct[i])
        }
    }
    listProduct = listProductNew
    show(listProduct)
}

function editProduct(nameOfProduct){
    newName = prompt("Nhập tên mới cho sản phẩm: ")
    if(newName != "" || newName != null){
        for(i=0;i<listProduct.length;i++){
            if(listProduct[i] == nameOfProduct){           
               listProduct[i] = newName
            }
        }
    }
    else if(newName == "" || newName == null){
        listProduct[i] == nameOfProduct
    }
   
    show(listProduct)
}