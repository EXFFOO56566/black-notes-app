.class final Lcom/google/android/gms/common/internal/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/g$a;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/common/api/g;

.field private final synthetic b:Lb/c/b/a/h/g;

.field private final synthetic c:Lcom/google/android/gms/common/internal/q$a;

.field private final synthetic d:Lcom/google/android/gms/common/internal/q$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/g;Lb/c/b/a/h/g;Lcom/google/android/gms/common/internal/q$a;Lcom/google/android/gms/common/internal/q$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/b0;->a:Lcom/google/android/gms/common/api/g;

    iput-object p2, p0, Lcom/google/android/gms/common/internal/b0;->b:Lb/c/b/a/h/g;

    iput-object p3, p0, Lcom/google/android/gms/common/internal/b0;->c:Lcom/google/android/gms/common/internal/q$a;

    iput-object p4, p0, Lcom/google/android/gms/common/internal/b0;->d:Lcom/google/android/gms/common/internal/q$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/common/internal/b0;->a:Lcom/google/android/gms/common/api/g;

    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/common/api/g;->a(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/k;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/b0;->b:Lb/c/b/a/h/g;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/b0;->c:Lcom/google/android/gms/common/internal/q$a;

    invoke-interface {v1, p1}, Lcom/google/android/gms/common/internal/q$a;->a(Lcom/google/android/gms/common/api/k;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb/c/b/a/h/g;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/b0;->b:Lb/c/b/a/h/g;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/b0;->d:Lcom/google/android/gms/common/internal/q$b;

    invoke-interface {v1, p1}, Lcom/google/android/gms/common/internal/q$b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb/c/b/a/h/g;->a(Ljava/lang/Exception;)V

    return-void
.end method
