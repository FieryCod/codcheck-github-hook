(ns codcheck.api.common.error)

(defn InvalidGhSignature
  [msg]
  (ex-info msg {:status "InvalidGhSignature"
                :statusCode 401}))

(defn RouteNotFound
  [route]
  (ex-info (str "Route " route " not found!") {:status "RouteNotFound"
                                               :statusCode 404}))

(defn BadRequest
  [msg]
  (ex-info msg {:status "BadRequest"
                :statusCode 400}))

(defn InvalidContentType
  [msg]
  (ex-info msg {:status "InvalidContentType"
                :statusCode 400}))

(defn NotSupportedGhEvent
  [msg]
  (ex-info msg {:status "NotSupportedGhEvent"
                :statusCode 400}))

(defn NotSupportedGhAction
  [msg]
  (ex-info msg {:status "NotSupportedGhAction"
                :statusCode 400}))
