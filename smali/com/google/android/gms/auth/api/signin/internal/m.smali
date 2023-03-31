.class final Lcom/google/android/gms/auth/api/signin/internal/m;
.super Lcom/google/android/gms/auth/api/signin/internal/f;
.source ""


# instance fields
.field private final synthetic b:Lcom/google/android/gms/auth/api/signin/internal/n;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/signin/internal/n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/m;->b:Lcom/google/android/gms/auth/api/signin/internal/n;

    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/internal/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/m;->b:Lcom/google/android/gms/auth/api/signin/internal/n;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a(Lcom/google/android/gms/common/api/k;)V

    return-void
.end method
