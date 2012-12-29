# Backlog Commenter

Backlog Commenter is command-line utility to add a comment to [Backlog](http://www.backlog.jp/).
Backlog Commenter uses [Backlog API for Clojure](https://github.com/bouzuya/clj-backlog/).

## Usage

    git clone git://github.cm/bouzuya/clj-backlog-commenter
    cd clj-backlog-commenter
    lein uberjar
    cd target
    java -jar backlog-commenter-0.1.0-standalone.jar \
        SPACENAME USERNAME PASSWORD ISSUEKEY COMMENT

## License

Copyright © 2012 bouzuya

Distributed under the Eclipse Public License, the same as Clojure.

