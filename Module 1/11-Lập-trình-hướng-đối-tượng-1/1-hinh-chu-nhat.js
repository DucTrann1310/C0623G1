class Rectangle{
    constructor(width, height){
        this.width = width
        this.height = height
        this.Perimeter = (this.width+this.height)*2
        this.area = this.width*this.height
    }
}

let Rectangle_1 = new Rectangle(5,10)
console.log(Rectangle_1);

