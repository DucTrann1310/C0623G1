function equation(a, b) {
    if (a == 0) {
        if (b == 0) {
            return "Phương trình vô số nghiệm";
        } else if (b != 0) {
            return "Phương trình vô nghiệm";
        }
    } else {
        x = -b / a;
        return `Phương trình có nghiệm x = ${x}`;
    }

}
console.log(equation(5, 8));