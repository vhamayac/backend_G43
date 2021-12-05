package G43_VHAMAYAC.G43_VHAMAYAC.modelo.custom;

public class StatusRes {

        private int completed;
        private int  cancelled;

        public StatusRes(int completed, int cancelled) {
            this.completed = completed;
            this.cancelled = cancelled;
        }

        public int getCompleted() {

            return completed;
        }

        public void setCompleted(int completed) {

            this.completed = completed;
        }

        public int getCancelled() {

            return cancelled;
        }

        public void setCancelled(int cancelled) {

            this.cancelled = cancelled;
        }



}


