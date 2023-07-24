class Temperature{
    constructor(nhietdo){
        this.nhietdo = nhietdo
    }
    doiDoF(){
        let doF = this.nhietdo*1.8 + 32
        return doF
    }
    doiDoK(){   
        let doK = this.nhietdo + 273.15
        return doK
    }
}
let hailamdo = new Temperature(25)
console.log(hailamdo.doiDoF());
console.log(hailamdo.doiDoK());