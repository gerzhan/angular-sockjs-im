(..
 app
 (factory
  "socket"
  (fn [$rootScope]
    (def sock (new SockJS "http://localhost:3000/chat"))
    (set! (:emit sock)
          (fn [data]
            (. sock send (serialize data))))
    sock)))
