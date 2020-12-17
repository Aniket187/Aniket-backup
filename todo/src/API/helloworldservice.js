import axios from "axios"
class helloworldservice{
    excuteserviice(){
        console.log("in helloworldservice")
        return axios.get("http://localhost:8080/Helloworld")
    }
    errormsg(){
        console.log("inside error message")
        return axios.get("http://localhost:8080/Helloworld")
    }
}
export default new helloworldservice();