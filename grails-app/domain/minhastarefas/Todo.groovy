package minhastarefas

import grails.rest.Resource

@Resource(uri='/todos', readOnly = false, formats = ['json', 'xml'])
class Todo {
    String name
    boolean completed

    static constraints = {
    }
}
