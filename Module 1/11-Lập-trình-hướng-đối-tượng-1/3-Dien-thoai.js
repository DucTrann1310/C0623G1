class Dienthoai{
    constructor(){
        this.status = false
        this.battery = null
        this.soanTinNhan = null
        this.hopThuDen = null
        this.tinDaGui = null
        this.luuTinDaGui = null
    }
    getBattery(){
        return this.battery
    }
    setBattery(battery){
        this.battery = battery
    }
    decreaseBattery(){
        if(this.battery > 0){
            this.battery--
        }
    }
    checkDienthoai(){
        if(this.getBattery() > 0){
            this.status = true
            this.decreaseBattery()
            return "Điện thoại bật";
        }else{
            this.status = false
            return "Điện thoại tắt";
        }
    }
    turnOn(){
        if(this.getBattery() > 0){
            this.status = true
            this.decreaseBattery()
            return "Bật";
        }    
    }
    turnOff(){
        this.status = false
        return "Tắt";
    }
    chargeBattery(){
        this.battery++
    }
    getSoanTinNhan(){
        if(this.turnOn()){
            this.decreaseBattery()
            return this.soanTinNhan
        }
    }
    setSoanTinNhan(soanTinNhan){
        if(this.turnOn()){
            this.decreaseBattery()
            this.soanTinNhan = soanTinNhan
            this.luuTinDaGui = soanTinNhan
        }
    }
    getNhanTinNhan(){
        if(this.turnOn()){
            this.decreaseBattery()
            return this.hopThuDen
        }
    }
    setNhanTinNhan(hopThuDen){
        if(this.turnOn()){
            this.decreaseBattery()
            this.hopThuDen = hopThuDen
        }
    }
    getGuiTinNhan(){
        if(this.turnOn()){
            this.decreaseBattery()
            return this.tinDaGui
        }
    }
    setGuiTinNhan(){
        if(this.turnOn()){
            this.decreaseBattery()
            this.tinDaGui = this.luuTinDaGui
        }
    }


}

let nokia = new Dienthoai
nokia.setBattery(60);

console.log("Kiểm tra điện thoại: ", nokia.checkDienthoai());
console.log("Bật điện thoại: ", nokia.turnOn());
console.log(nokia.getBattery());

nokia.setSoanTinNhan("Soạn tin nhắn");
console.log("Kiểm tra tin nhắn đã soạn: ", nokia.getSoanTinNhan());
console.log(nokia.getBattery());


nokia.setGuiTinNhan()
console.log("Kiểm tra tin nhắn đã gửi: ", nokia.getGuiTinNhan());
console.log(nokia.getBattery());






let iphone = new Dienthoai
iphone.setBattery(100);

console.log("Kiểm tra điện thoại: ", iphone.checkDienthoai());
console.log("Bật điện thoại: ", iphone.turnOn());
console.log(iphone.getBattery());

iphone.setNhanTinNhan(nokia.getGuiTinNhan())
console.log("Kiểm tra tin nhắn đã nhận: ", iphone.getNhanTinNhan());
console.log(iphone.getBattery());