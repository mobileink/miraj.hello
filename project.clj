(defproject hello "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :source-paths ["src/clj/main" "src/clj/config"]
  :dependencies [[org.clojure/clojure "1.8.0-RC4"]
                 [miraj/html "5.1.0-SNAPSHOT"]
                 [polymer/iron "1.2.3-SNAPSHOT"]
                 [polymer/paper "1.2.3-SNAPSHOT"]
                 [polymer/platinum "1.2.3-SNAPSHOT"]
                 [compojure "1.4.0"]
                 [ring/ring-defaults "0.1.5"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler core/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
