(ns backlog-commenter.core
  (:require [backlog :as backlog]
            [backlog.config :as config])
  (:gen-class))

(defn -main
  [& args]
  (let [[spacename username password issue-key comment] args]
    (binding [config/*backlog-auth* {:spacename spacename
                                     :username username
                                     :password password}]
      (backlog/add-comment issue-key comment))))

