function aparecerCampo() {
    let tarefa = pegarElementoID("editar");
    tarefa.removeAttribute("hidden");    
}
// tinha associado ao evento onsubmit do formulario, funcionou. vou testar outras formas de fazer o mesmo.
// function sumirCampo(){
    // let tarefa = pegarElementoID("editar");
    // tarefa.setAttribute("hidden", true);
// }

function editarTarefa(id, token){
    let descricao = pegarElementoID("editar");
    let tarefa = descricao.value;
    
    

    let editandoTarefa= {
        description: tarefa,	
        completed: false    
    }
    
    let urleditarTarefa = `https://ctd-todo-api.herokuapp.com/v1/tasks/${id}`;

    let edicaoTarefaJSON = JSON.stringify(editandoTarefa);

    let endpoint = {
        method: 'PUT',
        headers: {
            'content-type': 'application/json',
            'authorization': token
        },
        body: edicaoTarefaJSON
    }
    
    fetch(urleditarTarefa, endpoint)
    .then(response => {
        if (response.status == 200) {
            console.log("Tarefa editada com sucesso")
            return ("Tarefa editada com sucesso")

        } else {
            console.log(response)
            return ("Erro ao editar tarefa")
        }

    }).then(data => {
        window.location.reload = 'tarefas.html'
        return data.jwt

    }).catch(error => {
        if (error == 400) {
            console.log('Erro 400');
            alert('Erro 400')
        } else {
            console.log('Tente novamente mais tarde');
            alert('Tente novamente mais tarde')
        }
    })

}









