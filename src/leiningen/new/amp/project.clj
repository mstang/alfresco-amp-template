(defproject {{sanitized-name}} "0.1.0-SNAPSHOT"
  :title "FIXME: write title"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license { :name "Eclipse Public License"
             :url "http://www.eclipse.org/legal/epl-v10.html" }
  :min-lein-version "2.5.0"
  :profiles { :dev { :plugins [[lein-amp "0.6.0"]] }
              :provided { :dependencies [
                                          [org.clojure/clojure "1.8.0"]
                                          [org.clojars.lambdalf/lambdalf "0.1.0"]
                                        ] }}
  :source-paths    ["src/clojure"]
  :resource-paths  ["src/resource"]
  :amp-source-path "src/amp")
