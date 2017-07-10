package minhastarefas

class BootStrap {

    def init = { servletContext ->

        def todos = [
                [name: 'limpar a casa', completed: false],
                [name: 'agua do cachorro', completed: false],
                [name: 'alimentar o cachorro', completed: false],
                [name: 'pagar contas', completed: false],
                [name: 'correr', completed: true],
                [name: 'nadar', completed: true]
        ].each { new Todo(name: it.name, completed: it.completed).save()

        }

    }
    def destroy = {
    }
}
