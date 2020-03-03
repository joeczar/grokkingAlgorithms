from collections import deque

graph = {
    "you": ["alice", "bob", "claire"],
    "bob": ["anuj", "peggy"],
    "alice": ["peggy"],
    "claire": ["thom", "jonny"],
    "anuj": [],
    "peggy": [],
    "thom": [],
    "jonny": []
}

print(graph["you"])


def person_is_seller(name):
    return name[-1] == 'm'


def search(name):
    search_que = deque()
    search_que += graph[name]
    searched = []
    while search_que:
        person = search_que.popleft()
        if person not in searched:
            if person_is_seller(person):
                print(person + " is a  Mango seller!")
                return True
            else:
                search_que += graph[person]
                searched.append(person)
    return False


search("you")
