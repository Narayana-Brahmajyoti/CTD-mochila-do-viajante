
function tarefaPendente(tarefa) {

    let dataConvertida = dayjs(tarefa.createdAt).format('DD/MM/YYYY')
    let ul = document.querySelector('.tarefas-pendentes')
    let li = document.createElement('li')
    li.classList.add('tarefa')
    li.innerHTML = `
    <div class="not-done" id="${tarefa.id}" onclick="finalizarTarefa(${tarefa.id}, token)" ></div>
    <div class="descricao">
        <p class="nome">${tarefa.description}</p>
        <div class="editar" >
            <form >
                <input id="editar" type="text" placeholder="Digite aqui sua tarefa" hidden>
                    <button class="btn-send" onclick="editarTarefa(${tarefa.id}, token)" >
                        <img src="./assets/send.png" alt="enviar"> 
                    </button>
            </form>        
            <button class="btn-editar" onclick="aparecerCampo()" >
                <img src="./assets/Pngtree-pencil icon_5.png" alt="editar tarefa" id="editar">
            </button>
            <p class="timestamp"><i class="far fa-calendar-alt"></i> ${dataConvertida}</p>
        </div>
    </div>
`
    ul.appendChild(li)

}

{/* <form class="nova-tarefa"> */}
  {/* <div class="not-done "></div> */}
  {/* <input id="novaTarefa" type="text" placeholder="Nova tarefa"> */}
  {/* <button type="submit"> */}
    {/* <img src="./assets/plus.png" alt="Adicionar uma nova tarefa"> */}
  {/* </button> */}
{/* </form> */}
{/*  */}