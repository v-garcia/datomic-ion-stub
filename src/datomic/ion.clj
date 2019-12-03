(ns datomic.ion)

(defn get-env
  []
  (-> "DATOMIC_ENV_MAP" System/getenv read-string))

(defn get-app-info
  []
  (-> "DATOMIC_APP_INFO_MAP" System/getenv read-string))

(defn get-params
  [& _]
  {})

