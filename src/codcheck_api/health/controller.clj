(ns codcheck-api.health.controller
  (:require
   [compojure.core :as compojure]
   [compojure.route]
   [codcheck-api.consts.path :as consts-path]
   [codcheck-api.common.response :as common-response]))

(compojure/defroutes health-controller
  (compojure/context consts-path/health []

    (compojure/GET "/" []
      (common-response/success "API operational"))

    (compojure/GET "/favicon.ico" []
      (compojure.route/not-found "no favicon"))))
