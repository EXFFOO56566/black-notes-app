.class final Lcom/google/android/gms/auth/api/signin/internal/n;
.super Lcom/google/android/gms/auth/api/signin/internal/p;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/auth/api/signin/internal/p<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/auth/api/signin/internal/p;-><init>(Lcom/google/android/gms/common/api/f;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/k;
    .locals 0

    return-object p1
.end method

.method protected final synthetic a(Lcom/google/android/gms/common/api/a$b;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/auth/api/signin/internal/j;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/c;->w()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/api/signin/internal/v;

    new-instance v1, Lcom/google/android/gms/auth/api/signin/internal/m;

    invoke-direct {v1, p0}, Lcom/google/android/gms/auth/api/signin/internal/m;-><init>(Lcom/google/android/gms/auth/api/signin/internal/n;)V

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/internal/j;->B()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/auth/api/signin/internal/v;->a(Lcom/google/android/gms/auth/api/signin/internal/t;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method
