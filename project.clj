(defproject codcheck "0.1.0-SNAPSHOT"
  :description "Validate your commit messages with ease"

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [compojure "1.6.1"]
                 [com.taoensso/timbre "4.10.0"]
                 [org.clojure/core.async "0.4.474"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.3.2"]
                 [ring-logger "1.0.1"]]

  :source-paths ["src"]


  :plugins [[lein-ring "0.12.4"]
            [jonase/eastwood "0.2.6"]]

  :ring {:handler codcheck.server/runnable-server
         :adapter {:min-threads 5 :max-threads 150}
         :async?  false}

  :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "4.0.1"]
                                  [ring/ring-mock "0.3.0"]]}})
