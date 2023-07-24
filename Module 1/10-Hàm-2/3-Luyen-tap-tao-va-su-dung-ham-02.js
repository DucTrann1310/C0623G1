                        // Bài 1
// let a = +prompt("Nhập số bất kì: ")
// function tinhBinhPhuong(sobatki){
//     let result = 0;
//     result = sobatki*sobatki;
//     return result
// }
//     // tinhBinhPhuong(a)
//     console.log(`Bình phương của ${a} là ${tinhBinhPhuong(a)}`);




                        // Bài 2
// let a = +prompt("Nhập bán kính hình tròn: ")
// function tinhDienTich(bankinh){
//     let dientich = 0
//     dientich = 3.14*bankinh*bankinh
//     return dientich
// }
// function tinhChuVi(bankinh){
//     let chuvi = 0
//     chuvi = 2*3.14*bankinh
//     return chuvi
// }
// function tinhChuViVaDienTich(bankinh){
//     console.log(`Diện tích là ${tinhDienTich(bankinh)}`);
//     console.log(`Chu vi là ${tinhChuVi(bankinh)}`);
// }
//     tinhChuViVaDienTich(a)
 


                            // Bài 3
// let a = +prompt("Nhập số bất kì: ")
// function tinhGiaiThua(so){
//     b = 1
//     for(i=1;i<=a;i++){
//         b*=i
//     }
//     return b
// }
// console.log(tinhGiaiThua(a));




                            // Bài 4
// let a = prompt("Nhập kí tự bất kì: ")
// function kiemtra(kitu){
//     b = ""
//     b = isNaN(kitu)
//     if(b == false){
//         return `${kitu} là kí tự số`
//     }
//     else{
//         return `${kitu} không phải là kí tự số`
//     }
// }
// console.log(kiemtra(a));



                            // Bài 5
// function timsonhohnat(sobatki){
//     let arr = new Array(sobatki)
//     for(i=0;i<arr.length;i++){
//         arr[i] = prompt(`Nhập số thứ ${i+1}: `)
//     }
//     console.log(arr);
//     let min = arr[0]
//     for(j=1;j<arr.length;j++){
//         if(arr[i] < min){
//             min = arr[i]
//         }
//     }
//     return min
// }
// console.log(timsonhohnat(3));



                            // Bài 6
// let a = +prompt("Nhập số bất kì: ")
// function kiemtra(sobatki){
//     if(sobatki > 0)
//         return true
    
//     else
//         return false   
// }
// console.log(kiemtra(a));



                            // Bài 7
// let a = +prompt("Nhập số bất kì a =  ");
//     b = +prompt("Nhập số bất kì b =  ");
// function doicho(i,j){
//     temp = a
//     a = b
//     b = temp
//     return a,b
// }
// console.log(doicho(a,b));




                            // Bài 8
// function daonguocmang(tongsonhapvao){
//     arr = new Array(tongsonhapvao)
//     arrNew = new Array
//     for(i=0;i<arr.length;i++){
//         arr[i] = +prompt(`Nhập vào ${tongsonhapvao} số nguyên bất kì = `)
//     }
//     arrNew = arr.reverse()
//     return arrNew
// }
// console.log(daonguocmang(6));





                            // Bài 9
// function kiemtra(mang,kitu){
//     arr = new Array(mang)
//     count = 0
//     for(i=0;i<arr.length;i++){
//         arr[i] = +prompt(`Nhập ${mang} kí tự có trong mảng: `)
//     }
//     for(j=0;j<arr.length;j++){
//         if(b == arr[i]){
//             count++
//         }
//     }
//     if(count > 0){
//         return `Số lần xuất hiện của kí tự là ${count}`
//     }
//     else{
//         return -1
//     }
// }
// let a = +prompt("Nhập số kí tự có trong mảng = ")
//     b = prompt("Nhập kí tự bất kì: ")
//     console.log(kiemtra(a,b));