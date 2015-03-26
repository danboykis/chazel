(defproject chazel "0.1.0-SNAPSHOT"
  :description "hazelcast bells and whistles under the clojure belt"
  :url "https://github.com/tolitius/chazel"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src" "src/chazel"]

  :profiles {:dev {:jvm-opts ["-Dconf=resources/config.edn"]}}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [cprop "0.1.0-SNAPSHOT"]
                 [org.clojure/tools.logging "0.3.1"]
                 [com.hazelcast/hazelcast "3.4.1"]
                 [com.hazelcast/hazelcast-client "3.4.1"]
                 [clj-wallhack "1.0.1"]])