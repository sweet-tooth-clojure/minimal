(ns minimal.cross.endpoint-routes
  (:require [sweet-tooth.endpoint.routes.reitit :as serr]
            [integrant.core :as ig]))

(def routes
  (serr/expand-routes
   [{::serr/path-prefix "/api/v1"}]))

(defmethod ig/init-key ::routes [_ _]
  routes)
