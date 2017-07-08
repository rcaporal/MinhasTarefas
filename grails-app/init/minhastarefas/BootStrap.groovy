package minhastarefas

class BootStrap {

    def init = { servletContext ->

        def todos = [
                [name: 'limpar a casa'],
                [name: 'agua do cachorro'],
                [name: 'alimentar o cachorro'],
                [name: 'pagar contas'],
                [name: 'correr'],
                [name: 'nadar']
        ].each { new Todo(name: it.name).save() }

    }
    def destroy = {
    }
}
