function find(b, array) {
    let flag = false;
    for (let i = 0; i < array.length; i++) {
        if (array[i] == b) {
            flag = true;
            break;
        }
    }
    if (flag == true) {
        console.log(`${b} nằm trong mảng`);
    } else {
        console.log(`${b} không nằm trong mảng`);
    }
}

let arrayA = [1, 3, 5, 9, 6, 8, 20];
let a = 5;
find(a, arrayA);

// function find(b, array) {
//     for (let i = 0; i < array.length; i++) {
//         if (array[i] == b) {
//             return  i;
//         }
//     }
//     return -1;
// }
// let arrayA = [1, 3, 5, 9, 6, 8, 20];
// let a = 5;
// if(find(5, arrayA) != -1){
//     console.log(`a có nằm trong mảng`);
// }