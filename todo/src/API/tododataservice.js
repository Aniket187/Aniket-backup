import axios from "axios"

class tododataservice{   
    alltodo(name){
    console.log("in helloworldservice")
    return axios.get(`http://localhost:8080/user/${name}/todos`)
}
deletetodo(name,id){
    console.log("in delete todo Api ")
    return(axios.delete(`http://localhost:8080/Delete/${name}/todos/${id}`))
}
singletodo(name ,id){
    
    return axios.get(`http://localhost:8080/user/${name}/todos/${id}`)
}
UPDATE(name,id,todo){
    console.log("in update todo Api ")
    return(axios.put(`http://localhost:8080/user/${name}/todos/${id}`,todo))
}
create(name,todo){
    console.log("in create todo Api ")
    return(axios.post(`http://localhost:8080/user/${name}/todos`,todo))
}



}
export default new tododataservice();