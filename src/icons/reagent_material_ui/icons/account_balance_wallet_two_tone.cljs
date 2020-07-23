(ns reagent-material-ui.icons.account-balance-wallet-two-tone
  "Imports @material-ui/icons/AccountBalanceWalletTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def account-balance-wallet-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13 17c-1.1 0-2-.9-2-2V9c0-1.1.9-2 2-2h6V5H5v14h14v-2h-6z", "opacity" ".3"}) (e "path" #js {"d" "M21 7.28V5c0-1.1-.9-2-2-2H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2v-2.28c.59-.35 1-.98 1-1.72V9c0-.74-.41-1.38-1-1.72zM20 9v6h-7V9h7zM5 19V5h14v2h-6c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h6v2H5z"}) (e "circle" #js {"cy" "12", "r" "1.5", "cx" "16"}))
                                                      "AccountBalanceWalletTwoTone"))
